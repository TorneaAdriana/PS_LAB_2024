import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject} from 'rxjs';
import {User} from "../model/User";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  baseURL:string="http://localhost:8082/user";
  ownerDataStream:any;

  constructor(private httpClient:HttpClient) {
    this.ownerDataStream=new BehaviorSubject<any>(null);
  }

  findAllUser(){
    return this.httpClient.get(this.baseURL+"/all");
  }

  deleteUser(id:number){
    return this.httpClient.delete(this.baseURL+"/delete"+id);
  }

  public login(username:any, password:any): any
  {
    let credentials = {username: username,password:password};
    return this.httpClient.post('http://localhost:8082/user/login',
      JSON.stringify(credentials) ,{headers:{'Content-Type':'application/json'},observe:'response'});
  }

}

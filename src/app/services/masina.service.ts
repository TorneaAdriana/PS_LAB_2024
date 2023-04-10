import {Injectable} from '@angular/core';
import {HttpClient, HttpParams} from '@angular/common/http';
import {Masina} from "../model/Masina";


@Injectable({
  providedIn: 'root'
})
export class MasinaService {

  baseURL: string = "http://localhost:8082/car";

  constructor(private httpClient: HttpClient) {
  }

  getAllCars() {
    return this.httpClient.get<Masina[]>(this.baseURL);
  }

  getMasinaById(id: number) {
    let params = new HttpParams().set('id', id);
    return this.httpClient.get(this.baseURL + "/findById", {params: params})
  }

  getMasinaByMarca(marca: string) {
    return this.httpClient.get(this.baseURL + "/find/" + marca);
  }

  deleteMasina(id: number) {
    return this.httpClient.delete(this.baseURL + id);
  }
}

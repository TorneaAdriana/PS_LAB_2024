import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Masina} from "../../model/Masina";
import {MasinaService} from "../../services/masina.service";

@Component({
  selector: 'app-first-page',
  templateUrl: './first-page.component.html',
  styleUrls: ['./first-page.component.css']
})
export class FirstPageComponent implements OnInit {

  masinaList:Masina[] = [];
  ownerList:any;
  updateForm:FormGroup | undefined;

  constructor(private masinaService:MasinaService,
              private formBuilder:FormBuilder) { }

  ngOnInit(): void {
    this.masinaService.getAllCars().subscribe((res)=>{
        console.log(res);
        this.masinaList=res;
      },
      (_error)=>{

      });

    this.masinaService.getMasinaById(1).subscribe();
    this.masinaService.getMasinaByMarca("Logan").subscribe();

    this.initOwnerCarsForm();
  }

  initOwnerCarsForm(){
    this.updateForm=this.formBuilder.group({
      ownerInput:[null, Validators.required],
      carInput:[null,Validators.required]
    })
  }

}

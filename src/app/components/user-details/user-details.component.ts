import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";
import {UserService} from "../../services/user.service";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-car-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent implements OnInit {

  loginForm: FormGroup ;

  constructor(private formBuilder: FormBuilder,
              private service: UserService,
              private router: Router) {
  }

  ngOnInit(): void {
    this.initLoginForm();
  }

  initLoginForm() {
    this.loginForm = this.formBuilder.group({
      username: [null, Validators.required],
      password: [null, Validators.required]
    })
  }

  public loginUser(): void {

    // @ts-ignore
    const username = this.loginForm.value.username;
    // @ts-ignore
    const password = this.loginForm.value.password;

    this.service.login(username, password).subscribe((data: any) => {

      if(data.body.userRole==='CLIENT')
      {
        localStorage.setItem('user',data.body.userRole);

        //rutarea catre alte pagini

        console.log(data.body.userRole)

      }
      else
      if(data.body.userRole==="DRIVER")
      {
        localStorage.setItem('user',data.body.userRole);

      }
    });
  }
}

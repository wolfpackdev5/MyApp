import { Component, OnInit } from '@angular/core';
import { CreateAccountService } from 'src/app/service/create-account/create-account.service';
import { FormGroup, FormControl, Validators, FormBuilder} from '@angular/forms';

@Component({
  selector: 'app-create-account',
  templateUrl: './create-account.component.html',
  styleUrls: ['./create-account.component.css']
})
export class CreateAccountComponent implements OnInit {
  //values for email, name, bio, age, weight
  email!: string;
  firstName!: string;
  lastName!: string;
  bio!: string;
  age!: number;
  weight!: number;

  accountForm!: FormGroup;

  constructor(private cas: CreateAccountService, /*private fb: FormBuilder*/) {
    //this.myForm();
   }

   /*myForm() {
     this.accountForm = this.fb.group({

     })
   }*/

  ngOnInit(): void {
  }

  submitAccount(): any {
      this.cas.newAccount(this.email, this.firstName, this.lastName, this.bio, 
        this.age, this.weight).subscribe(
          (response: any) => {
            alert(response);
          }
        )
    }

}

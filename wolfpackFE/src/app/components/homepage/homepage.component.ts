import { Component, OnInit } from '@angular/core';
import { HomepageService } from 'src/app/service/homepage/homepage.service';
import { Client } from 'src/app/models/client';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {
  email = ' ';
  constructor(private hps: HomepageService) {}
  ngOnInit(): void {  }

  submitEmail() : void {
    console.log(this.email);
    if(this.email.match("[a-zA-z0-9]+@+[a-z]+.com")) {
      this.hps.newClient(this.email).subscribe(
        (response) => {
          alert(response);
        });
    } else {
      alert("not a valid email");
    }
    //window.location.reload();
  }

}

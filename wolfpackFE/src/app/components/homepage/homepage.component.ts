import { Component, Input, OnInit } from '@angular/core';
import { HomepageService } from 'src/app/service/homepage/homepage.service';
import { NgForm } from '@angular/forms';
import { HttpClient, HttpEvent, HttpRequest, HttpResponse, HttpResponseBase, HttpStatusCode } from '@angular/common/http';
import { Text } from '@angular/compiler';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {
  email = "";
  constructor(private hps: HomepageService) {}
  ngOnInit(): void {
  }

  submitEmail() : void {
    if(this.email.match("[a-zA-z0-9]+@+[a-z]+.com")) {
      this.hps.newClient(this.email).subscribe(
        (response) => {
          alert(response);
        });
    } else {
      alert("not a valid email");
    }
  }

}

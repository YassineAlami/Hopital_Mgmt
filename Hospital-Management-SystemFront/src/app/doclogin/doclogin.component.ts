import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-doclogin',
  templateUrl: './doclogin.component.html',
  styleUrls: ['./doclogin.component.css']
})
export class DocloginComponent implements OnInit {

  username = 'user'
    password = ''
    invalidLogin = false

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  checkLogin() {
  
      
  }

}

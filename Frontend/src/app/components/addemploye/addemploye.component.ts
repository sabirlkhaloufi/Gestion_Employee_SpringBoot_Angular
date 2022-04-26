import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-addemploye',
  templateUrl: './addemploye.component.html',
  styleUrls: ['./addemploye.component.css']
})
export class AddemployeComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  postUser(addForm:any){
    console.log(addForm.value);
  }

}

import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-listemploye',
  templateUrl: './listemploye.component.html',
  styleUrls: ['./listemploye.component.css']
})
export class ListemployeComponent implements OnInit {

  employers = [
    {
      id:1,nom:"aya aya",adresse:"casablanca",date_d:"22/02/2022",tel:"065423123",statu:"femme"
    },
    {
      id:1,nom:"brahim brahmi",adresse:"casablanca",date_d:"22/02/2022",tel:"065423123",statu:"femme"
    },
    {
      id:1,nom:"sabir sabir",adresse:"casablanca",date_d:"22/02/2022",tel:"065423123",statu:"femme"
    },
    {
      id:1,nom:"chaimae chaimae",adresse:"casablanca",date_d:"22/02/2022",tel:"065423123",statu:"femme"
    },
  ]
  constructor() { }

  ngOnInit(): void {
  }

}

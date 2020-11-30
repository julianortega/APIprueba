import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../../Service/service.service';
import { Customer } from 'src/app/Modelo/Customer';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css']
})
export class ListarCustomersComponent implements OnInit {
	
	customers:Customer[];
  constructor(private service:ServiceService, private router:Router) { }

  ngOnInit() {
	this.service.getCustomers()
	.subscribe(data=>{
		this.customers=data;
	})
  }

	ListarCP(id:number):void{
		localStorage.setItem("id", id.toString());
		this.router.navigate(["listarCP"]);
	}

}

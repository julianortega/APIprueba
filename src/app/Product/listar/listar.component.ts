import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../../Service/service.service';
import { Product } from 'src/app/Modelo/Product';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css']
})
export class ListarProductsComponent implements OnInit {
	
	products:Product[];
  constructor(private service:ServiceService, private router:Router) { }

  ngOnInit() {
	this.service.getProducts()
	.subscribe(data=>{
		this.products=data;
	})
  }

}

import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from 'src/app/Modelo/Product';
import { ServiceService } from 'src/app/Service/service.service';

@Component({
  selector: 'app-listar-products',
  templateUrl: './listar-products.component.html',
  styleUrls: ['./listar-products.component.css']
})
export class ListarCustomerProductsComponent implements OnInit {
	 products:Product[];
	 constructor(private router:Router, private service:ServiceService) { }

	  ngOnInit() {
		this.ListarCustomerProducts();
	  }

	ListarCustomerProducts(){
		let id=localStorage.getItem("id");
		this.service.getCustomerProducts(+id)
		.subscribe(data=>{
			this.products=data;
		})
	}


}

	


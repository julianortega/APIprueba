import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from '../Modelo/Product';
import { Customer } from '../Modelo/Customer';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
        
	
  	constructor(private http:HttpClient) { }

		UrlProducts='http://localhost:8080/products';
		UrlCustomers='http://localhost:8080/customers';
	
		
		getProducts(){
			return this.http.get<Product[]>(this.UrlProducts);
		}
		
		getCustomers() {
            return this.http.get<Customer[]>(this.UrlCustomers);
        }

		getCustomerProducts(id:number) {
            return this.http.get<Product[]>(this.UrlCustomers+"/"+id+"/products");
        }
}

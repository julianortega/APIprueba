import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListarProductsComponent } from './Product/listar/listar.component';
import { ListarCustomersComponent } from './Customer/listar/listar.component';
import { ListarCustomerProductsComponent } from './Customer/listar-products/listar-products.component';

import {FormsModule} from '@angular/forms';
import {ServiceService} from '../app/Service/service.service';
import {HttpClientModule} from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    ListarProductsComponent,
	ListarCustomersComponent,
	ListarCustomerProductsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
	FormsModule,
	HttpClientModule
  ],
  providers: [ServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }

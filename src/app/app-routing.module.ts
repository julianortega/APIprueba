import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListarProductsComponent } from './Product/listar/listar.component';
import { ListarCustomersComponent } from './Customer/listar/listar.component';
import { ListarCustomerProductsComponent } from './Customer/listar-products/listar-products.component';

const routes: Routes = [
	{path: 'listarP', component:ListarProductsComponent},
	{path: 'listarC', component:ListarCustomersComponent},
	{path: 'listarCP', component:ListarCustomerProductsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

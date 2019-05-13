import { CadastroClienteComponent } from './cadastro-cliente/cadastro-cliente.component';
import { LoginComponent } from './login/login.component';
import { NgModule, ModuleWithProviders } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule, Routes} from '@angular/router';

const appRoutes: Routes = [
  { path: '', component: LoginComponent },
  { path: 'cliente', component: CadastroClienteComponent }

];

export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);
@NgModule({
  imports: [
    CommonModule
  ],
  declarations: []
})
export class AppRoutingModule {


}

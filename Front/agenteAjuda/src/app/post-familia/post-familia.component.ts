import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Familia } from '../model/familia';
import { FamiliaService } from '../service/familia.service';

@Component({
  selector: 'app-post-familia',
  templateUrl: './post-familia.component.html',
  styleUrls: ['./post-familia.component.css']
})
export class PostFamiliaComponent implements OnInit {
 
  familia: Familia = new Familia()
  listaFamilia: Familia[]

  constructor(
    private familiaService: FamiliaService,
    private router: Router
  ) { }

  ngOnInit(): void {
  }
  findByIdFamilia(){
    this.familiaService.getByIdFamilia(this.familia.idFamilia).subscribe((resp: Familia) => {
      this.familia = resp;
    })
  }
  cadastrar(){
    if(this.familia.carteira == null){
      alert("Preencha o campo  de nome da carteira corretamente")
    }else{
      this.familiaService.postFamilia(this.familia).subscribe((resp: Familia) =>{
        this.familia = resp
        this.router.navigate(['/imc'])
        alert('Familia cadastrado com sucesso!')
      })
    }
  }
}

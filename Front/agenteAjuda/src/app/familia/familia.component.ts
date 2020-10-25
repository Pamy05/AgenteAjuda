import { Component, OnInit } from '@angular/core';
import { Familia } from '../model/familia';
import { FamiliaService } from '../service/familia.service';

@Component({
  selector: 'app-familia',
  templateUrl: './familia.component.html',
  styleUrls: ['./familia.component.css']
})
export class FamiliaComponent implements OnInit {
  
  familia: Familia = new Familia()
  idFamilia: number
  listaFamilia: Familia[]


  constructor(
    private familiaService: FamiliaService
  ) { }

  ngOnInit(): void {
  }
  findByIdFamilia(){
    this.familiaService.getByIdFamilia(this.familia.idFamilia).subscribe((resp: Familia) => {
      this.familia = resp;
    })
  }

}

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Familia } from '../model/familia';

@Injectable({
  providedIn: 'root'
})
export class FamiliaService {

  constructor(private http: HttpClient) { }
  getByIdFamilia(id: number){
    return this.http.get(`http://localhost:8080/familia/${id}`)
  }

  postFamilia(familia: Familia){
    return this.http.post('http://localhost:8080/familia', familia)
   }
}


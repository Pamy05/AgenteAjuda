import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PostFamiliaComponent } from './post-familia.component';

describe('PostFamiliaComponent', () => {
  let component: PostFamiliaComponent;
  let fixture: ComponentFixture<PostFamiliaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PostFamiliaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PostFamiliaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

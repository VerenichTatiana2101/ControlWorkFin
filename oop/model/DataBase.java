package model;

import java.util.ArrayList;
import java.util.List;

public class DataBase<T extends Animals> {

  private List<T> listPets = new ArrayList<>();
  private List<T> listPackanimals = new ArrayList<>();

  public void initPets(List<T> pets) {
    this.listPets = pets;
  }

  public void initPackanimals(List<T> packanimals) {
    this.listPackanimals = packanimals;
  }

  public List<T> getListPets() {
    return listPets;
  }

  public void setListPets(List<T> pets) {
    this.listPets = pets;
  }

  public List<T> getListPackanimals() {
    return listPackanimals;
  }

  public void setListPackanimals(List<T> packanimals) {
    this.listPackanimals = packanimals;
  }

  @Override
  public String toString() {
    String result = "";
    for (T pet : listPets) {
      result += pet.toString() + "\n";
    }
    for (T packanimal : listPackanimals) {
      result += packanimal.toString() + "\n";
    }
    return result;
  }

}

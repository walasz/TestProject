/*
 * Hozz letre egy iskolat, adj hozza legalabb 4 tanart akik kozul ketto osztalyfonok,8 diakot,2 osztalyt, 4 tantargyat.
Tantargyak: Matematika, Informatika, Irodalom, Tortenelem.

Minden diak legalabb ketto tantargyat kedvencenek tart.
Minden tanar legalabb egy tantargyat tanit.
Minden tanarnak van legalabb egy osztalya.


Iskola:
    + nev : String
    + diakok : List<Diak>
    + tanarok : List<Tanar>
    + tantargyak : List<Tantargy>

Tanar:
    + nev : String
    + osztalyfonok : Boolean
    + szigoru tanar : Boolean
    + tanitott tantargy : Tantargy
    + tanitott osztaly : List<Osztaly>
    + feleltet() : String (Visszaadja, hogy megfelelt e a diak)

Osztaly:
    + nev : String
    + letszam : Byte
    + diakok : List<Diak>

Diak:
    + nev : String
    + eletkor : Byte
    + tanulmanyi atlag : Float
    + osztalyfonok: Tanar
    + tantargyak<Tantargy> : Tantargy
    + felel(Tantargy, Tanar) : String (Visszaadja, hogy megfelelt e a diak)

Matematika:
    + Nev : String
    + Nehezseg : 10 (Byte)

Irodalom:
    + Nev : String
    + Nehezseg : 2 (Byte)

Informatika:
    + Nev: String
    + Nehezseg: 6 (Byte)


FELELTETES MUKODESE: 
    + Ha a tantargy benne van a diak kedvencei kozott akkor 10, kulonben 5 a szorzo. (Tovabbiakban SZORZO)
    + Ha a tanar szigoru akkor 3 ha kedves akkor pedig 10 (tovabbiakban SZIGORUSAG)
    + Legyen egy random szam generator ami 1 es 15 kozott kisorsol egy erteket. Tovabbiakban: TUDAS
    (Ezzel szimulalva azt, hogy a gyerek mennyire tudja az aktualis anyagot.)
    + Ha a tantargy MATEMATIKA akkor a nehezsegi szint 40 (NEHEZSEG)
      Ha egyeb tantargy akkor pedig 10

        Az erdemjegy kiszamitasa: (SZORZO * (SZIGORUSAG + TUDAS)) - NEHEZSEG
            Ha ez a szam 0 es 150 kozott van akkor az eredmeny: NEM FELELT MEG.
            Ha ez a szam 150 felett van akkor pedig MEGFELELT.

Valassz ki egy tanart es feleltesD le azokat a diakokat akik ennek a tanarnak 
az osztalyaba tartoznak es ird ki a konzolra a diak nevet, milyen tantargybol
felelt es mi lett az eredmeny!
    Pl: Roland, Matematika, MEGFELELT
 */
package school;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wanguars
 */
public class Main {
    
    public static void main(String[] args) {
        List<Subject> subjects = new ArrayList<>();
        List<Class> classes = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        List<Student> students1 = new ArrayList<>();
        List<Student> students2 = new ArrayList<>();
        
        Math ms = Math.builder();
        Literature lit = Literature.builder();
        ComputerScience cs = ComputerScience.builder();
        History his = History.builder();
        subjects.add(ms);
        subjects.add(lit);
        subjects.add(cs);
        subjects.add(his);
        
        teachers.add(new Teacher("Koós Piroska", true, true, ms));
        teachers.add(new Teacher("Kormos János", true, false, cs));
        teachers.add(new Teacher("Alpár Máté", false, true, lit));
        teachers.add(new Teacher("Koós Piroska", false, false, his));
        
        students1.add(new Student("Kiss Imre", 15, 3.6f, ms, lit, teachers.get(1)));
        students2.add(new Student("Nagy Tihamér", 16, 3.1f, lit, cs, teachers.get(2)));
        students1.add(new Student("Kovács Rita", 16, 4.6f, his, lit, teachers.get(1)));
        students1.add(new Student("Ürmös Balázs", 15, 3.0f, cs, ms, teachers.get(1)));
        students1.add(new Student("Juhász Hajnalka", 17, 2.3f, ms, cs, teachers.get(1)));
        students2.add(new Student("Kajmán Nikolett", 15, 3.9f, lit, cs, teachers.get(2)));
        students2.add(new Student("Jenes Kálmán", 15, 4.7f, ms, cs, teachers.get(2)));
        students2.add(new Student("Csintalan Ágoston", 16, 4.2f, his, lit, teachers.get(2)));
        
        classes.add(new Class("6b", students1));
        classes.add(new Class("7c", students2));
        
        teachers.get(0).setTeachedClass(classes);
        teachers.get(1).setTeachedClass(classes);
        teachers.get(2).setTeachedClass(classes);
        teachers.get(3).setTeachedClass(classes);
        
        System.out.println(teachers.get(2).exam(ms, students2.get(3)));
        
    }
    
}

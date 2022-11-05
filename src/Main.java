public class Main {
    private static System sistem;

    public static void main(String[] args) {
       var dog = 8.0 ;
       sistem.out.println (dog);
var cat = 3.6;
sistem.out.println(cat);
var paper = 763789;
sistem.out.println(paper);
        dog = dog + 4;
        sistem.out.println(dog);
        cat = cat + 4;
        sistem.out.println(cat);
        paper = paper + 4;
        sistem.out.println(paper);

        dog = dog-3.5;
sistem.out.println(dog);
cat = cat-1.6;
sistem.out.println(cat);
paper = paper-7639;
sistem.out.println(paper);

  var friend = 19;
  sistem.out.println(friend);
  friend +=2;
  sistem.out.println(friend);
  friend /= 7;
  sistem.out.println(friend);

  var frog = 3.5;
  sistem.out.println(frog);
  frog *= 10;
  sistem.out.println(frog);
  frog /= 3.5;
  sistem.out.println(frog);
  frog += 4;
  sistem.out.println(frog);

  var boxer1Weight = 78.2;
  var boxer2Weight = 82.7;
  var boxersWeight = boxer1Weight + boxer2Weight;
  sistem.out.println("общий вес боксеров: "  + boxersWeight);

  var differenceBoxersWeight = boxer2Weight - boxer1Weight;
  sistem.out.println("разница в весе боксеров: " + differenceBoxersWeight);

  sistem.out.println("разница в весе двух бойцов 1 : " + (boxer2Weight - boxer1Weight));
  sistem.out.println("разница в весе двух бойцов 2 : " + (boxer2Weight % boxer1Weight));

  var totalWorkingHours = 640;
  var hoursPerEmployee = 8;
  sistem.out.println ("Всего работников в компании -" + totalWorkingHours / hoursPerEmployee + "человек");

  var totalEmployeers = totalWorkingHours / hoursPerEmployee;
  var totalEmployeers2 = totalEmployeers + 94;
        totalWorkingHours = totalEmployeers2 * hoursPerEmployee;

  sistem.out.println( "Если в компании работает " + totalEmployeers2 + " человека, то всего " + totalWorkingHours + " часа работы может быть поделено между сотрудниками . ");



    }
}
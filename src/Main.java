public class Main {
    public static void main(String[] args) {
        Hero hero1=new Hero("Acer", "villain", 2, 22.5, true);
        System.out.println(hero1);
        System.out.println(hero1.getName());
        System.out.println(hero1.getAbilities());
        System.out.println(hero1.getLvl());
        System.out.println(hero1.getDamage());
        System.out.println(hero1.getFame());
        hero1.setName("Jabra");
        System.out.println(hero1.getName());
        hero1.setAbilities("genetic");
        System.out.println(hero1.getAbilities());
        hero1.setLvl(2);
        System.out.println(hero1.getLvl());
        hero1.setDamage(11.2);
        System.out.println(hero1.getDamage());
        hero1.setFame(false);
        System.out.println(hero1.getFame());
        System.out.println(hero1.damagePerSecond());
    }

}

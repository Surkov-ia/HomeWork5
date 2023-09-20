public class HomeWork5 {
    public static void main(String[] args) {
        PhoneBook PhoneBook = new PhoneBook();
        PhoneBook.add("899234929", "Алиса");
        PhoneBook.add("899268429", "Иван");
        PhoneBook.add("899213229", "Владимир");
        PhoneBook.add("899222229", "Давид");
        PhoneBook.add("899265529", "Алексадра");
        PhoneBook.add("899287729", "Сергей");
        PhoneBook.add("899241229", "Иван");
        PhoneBook.add("899244329", "Пётр");
        PhoneBook.add("899233329", "Александра");
        PhoneBook.add("899276729", "Андрей");
        PhoneBook.add("899266629", "Степан");
        PhoneBook.add("899211129", "Сергей");
        PhoneBook.add("899209929", "Владимир");
        PhoneBook.add("899204029", "Владимир");
        PhoneBook.add("899202229", "Викторя");
        PhoneBook.add("899200029", "Давид");
        PhoneBook.add("899244029", "Виталий");
        PhoneBook.add("899277729", "Виталий");
        System.out.println(PhoneBook.getAll().replace("[", "").replace("]", ""));
    }
}
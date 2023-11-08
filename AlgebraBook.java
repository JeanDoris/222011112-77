class AlgebraBook {
    public void algebraContent() {
        System.out.println("Algebra content from AlgebraBook");
    }
}

class ProgrammingBook {
    public void programmingContent() {
        System.out.println("Programming content from ProgrammingBook");
    }
}

class EconomicsBook {
    public void economicsContent() {
        System.out.println("Economics content from EconomicsBook");
    }
}

class LiteratureBook {
    public void literatureContent() {
        System.out.println("Literature content from LiteratureBook");
    }
}

class Library {
    public static void main(String[] args) {
        AlgebraBook algebraBook = new AlgebraBook();
        ProgrammingBook programmingBook = new ProgrammingBook();
        EconomicsBook economicsBook = new EconomicsBook();
        LiteratureBook literatureBook = new LiteratureBook();

        algebraBook.algebraContent();
        programmingBook.programmingContent();
        economicsBook.economicsContent();
        literatureBook.literatureContent();
    }
}

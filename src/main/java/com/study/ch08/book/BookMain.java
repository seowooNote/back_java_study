package com.study.ch08.book;

import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectedMenu = null;
        boolean loopFlag = true;

        Book[] books = new Book[3];
        BookRepository bookRepository = new BookRepository(books);
        BookService bookService = new BookService(bookRepository);

        while(loopFlag) {
            System.out.println("[도서 관리 프로그램]");

            System.out.print("저장할 도서의 갯수를 입력하세요 >>");
            int a = scanner.nextInt();
            books = new Book[a];

            System.out.println("[1] 도서 등록");
            System.out.println("[2] 도서 목록 조회");
            System.out.println("[q] 도서 관리 프로그램 종료");
            System.out.print("[입력] >> ");
            selectedMenu = scanner.nextLine();
            
            if("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("[도서 관리 프로그램 종료중 ...");
                loopFlag = false;
            } else if("1".equals(selectedMenu)) {
                if(bookService.isFull()) {
                    System.out.println("[더이상 도서를 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("도서 제목 입력 >> ");
                String name = scanner.nextLine();
                System.out.print("도서 저자 입력 >> ");
                String author = scanner.nextLine();

                Book book = new Book(name, author);
                bookService.append(book);

            } else if("2".equals(selectedMenu)) {
                bookService.printBookList();
            } else {
                System.out.println("[다시 입력하세요.]");
            }
        }

        System.out.println("[도서 관리 프로그램 종료]");
    }

}

package com.Class.Study250512.ClassWork6;

import java.util.ArrayList;
import java.util.Scanner;

public class libraryTest {
    private static ArrayList<Library> bookList = new ArrayList<>();
    private static ArrayList<Library> cart = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        // 初始化图书列表
        initializeBooks();
        
        // 显示图书列表
        displayBookList();
        
        System.out.println("温馨提示：一次最多购物10次");
        int count = 0;
        double totalAmount = 0;
        
        while (count < 10) {
            System.out.println("\n请输入图书编号选择图书（输入0显示购物车，-1退出）：");
            int id = sc.nextInt();
            
            if (id == -1) {
                break;
            } else if (id == 0) {
                displayCart(totalAmount);
                continue;
            }
            
            System.out.println("请输入购买图书的数量：");
            int num = sc.nextInt();
            
            double price = buyBooks(id, num);
            if (price > 0) {
                totalAmount += price;
                count++;
            }
            
            System.out.println("\n是否继续购买？(y/n)");
            if (sc.next().equalsIgnoreCase("n")) {
                break;
            }
        }
        
        // 显示最终购物信息
        displayCart(totalAmount);
        System.out.println("\n感谢您的惠顾，欢迎再次光临！");
        sc.close();
    }
    
    private static void initializeBooks() {
        bookList.add(new Library(1, "Java教程", 30.6, 30));
        bookList.add(new Library(2, "JSP教程", 42.1, 40));
        bookList.add(new Library(3, "SSH教程", 47.3, 15));
        bookList.add(new Library(4, "SpringBoot教程", 58.5, 10));
        bookList.add(new Library(5, "SSM教程", 55.0, 12));
    }
    
    private static void displayBookList() {
        System.out.println("\t图书列表");
        System.out.println("图书编号 图书名称\t图书单价 库存数量");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < bookList.size(); i++) {
            Library book = bookList.get(i);
            System.out.printf("%d\t%s\t%.1f\t%d\n",
                    book.getBookId(),
                    book.getBookName(),
                    book.getBookMoney(),
                    book.getBookNum());
        }
        System.out.println("-----------------------------------------------");
    }
    
    private static void displayCart(double totalAmount) {
        if (cart.isEmpty()) {
            System.out.println("\n购物车为空！");
            return;
        }
        
        System.out.println("\n=== 购物车信息 ===");
        System.out.println("图书名称\t单价\t数量\t小计");
        System.out.println("-----------------------------------------------");
        
        for (int i = 0; i < cart.size(); i++) {
            Library item = cart.get(i);
            double subtotal = item.getBookMoney() * item.getBookNum();
            System.out.printf("%s\t%.1f\t%d\t%.1f\n",
                    item.getBookName(),
                    item.getBookMoney(),
                    item.getBookNum(),
                    subtotal);
        }
        
        System.out.println("-----------------------------------------------");
        System.out.printf("总计金额：%.1f元\n", totalAmount);
    }
    
    public static double buyBooks(int id, int num) {
        // 查找图书
        Library selectedBook = null;
        for (int i = 0; i < bookList.size(); i++) {
            Library book = bookList.get(i);
            if (book.getBookId() == id) {
                selectedBook = book;
                break;
            }
        }
        
        // 验证图书是否存在
        if (selectedBook == null) {
            System.out.println("没有找到该图书！");
            return 0;
        }
        
        // 检查库存
        if (num > selectedBook.getBookNum()) {
            System.out.println("库存不足！当前库存: " + selectedBook.getBookNum());
            return 0;
        }
        
        // 添加到购物车
        Library cartItem = new Library(
            selectedBook.getBookId(),
            selectedBook.getBookName(),
            selectedBook.getBookMoney(),
            num
        );
        cart.add(cartItem);
        
        // 更新库存
        selectedBook.setBookNum(selectedBook.getBookNum() - num);
        
        // 计算并显示购买信息
        double totalPrice = selectedBook.getBookMoney() * num;
        System.out.println("\n=== 购买信息 ===");
        System.out.println("图书名称：" + selectedBook.getBookName());
        System.out.println("购买数量：" + num);
        System.out.println("单    价：" + selectedBook.getBookMoney());
        System.out.println("小    计：" + totalPrice);
        
        return totalPrice;
    }
}

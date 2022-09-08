package com.kh;

import com.kh.util.Common;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcMain {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            conn = Common.getConnection(); // 연결
            stmt = conn.createStatement();
            String sql = "SELECT * FROM EMP";
            rs = stmt.executeQuery(sql);

            System.out.println(rs);
            while(rs.next()) {
                System.out.print(rs.getInt("EMPNO") + " ");
                System.out.print(rs.getString("ENAME")+ " ");
                System.out.print(rs.getString("JOB")+ " ");
                System.out.print(rs.getInt("MGR")+ " ");
                System.out.print(rs.getDate("HIREDATE")+ " ");
                System.out.print(rs.getInt("SAL")+ " ");
                System.out.print(rs.getInt("COMM")+ " ");
                System.out.print(rs.getInt("DEPTNO")+ " ");
                System.out.println();
            }

        } catch(Exception e){
            e.printStackTrace();
        }



//        public static void menuSelect() {
//            Scanner sc = new Scanner(System.in);
//            EmpDAO dao = new EmpDAO();
//            while(true){
//                System.out.println("===== [EMP TABLE] =====");
//                System.out.println("메뉴를 조회하세요.");
//                System.out.println("[1] SELECT , [2] INSERT , [3] UPDATE , [4] DELETE , [5] EXIT : ");
//                int sel = sc.nextInt();
//                switch (sel) {
//                    case 1 :
//                        List<EmpVO> list = dao.empSelect();
//                        dao.printEmpSelect(list);
//                        break;
//                    case 2:
//                        dao.empInsert();
//                        break;
//                    case 3 :
//                        dao.empUpdate();
//                        break;
//                    case 4 :
//                        dao.empDelete();
//                        break;
//                    case 5 :
//                        System.out.println("메뉴를 종료합니다.");
//                        return;
//                }
//            }
//        }
    }
}

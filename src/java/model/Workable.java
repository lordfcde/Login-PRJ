/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author vinhh
 */
public interface Workable<T>{
    // Generic type t ở đây là kiểu dữ liệu T ( tuỳ chỉnh được kiểu dữ liệu khi implement Interface)
    int add(T x);
    int update(T x);
    int delete(int id);
    List<T> getAll();
    T searchById(int id);
    
    
}

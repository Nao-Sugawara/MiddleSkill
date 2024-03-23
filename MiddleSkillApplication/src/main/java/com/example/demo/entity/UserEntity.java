package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
* ユーザー情報 Entity
*/
@Entity // ここに追加
@Table(name = "users") // ここに追加
@Data
public class UserEntity {

	/**
	* ID
	*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id; // IDの型を修正（シリアルタイプに対応した型を選択）

	@Column(name = "name", nullable = false) // NOT NULL 制約を追加
	private String name;

	@Column(name = "address")
	private String address;

	@Column(name = "phone")
	private String phone;

	@Column(name = "update_date", nullable = false) // NOT NULL 制約を追加
	private Date updateDate; // 更新日時のデータ型を修正（Date型に対応した型を選択）

	@Column(name = "create_date", nullable = false) // NOT NULL 制約を追加
	private Date createDate;// 更新日時のデータ型を修正（Date型に対応した型を選択）

	@Column(name = "delete_date")
	private Date deleteDate;
}

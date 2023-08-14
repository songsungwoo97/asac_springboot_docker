<<<<<<< HEAD
package com.example.asac_week3.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;

    private String name;

    private String password;
}
=======
package com.example.asac_week3.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;

    private String name;

    private String password;
}
>>>>>>> e997f99ca410d0d6d7f04789bb796da7ed8e6d69

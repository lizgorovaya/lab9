package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="Author" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long ID;
    @Column(name="name")
    private String name;
    @Column(name="date_of_birth",columnDefinition = "text")
    private String date_of_birth;
    @Column(name="place_of_located")
    private int place_of_located;
    @Column(name="count_of_works")
    private int count_of_works;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "flowers")
    private List<Image> images = new ArrayList<>();

    private Long previewImageID;
    @ManyToOne(cascade = CascadeType.REFRESH,fetch =FetchType.LAZY )
    @JoinColumn
    private User user;
    private LocalDateTime dateOfCreated;
    @PrePersist
    private void init(){
        dateOfCreated=LocalDateTime.now();
    }
    public void addImageToAuthor(Image image){
        image.setAuthor(this);
        images.add(image);
    }
}

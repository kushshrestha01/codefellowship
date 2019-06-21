package com.shrestha.kush.codefellowship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class AppUser implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @OneToMany(mappedBy = "user")
    List<Post> posts;

    @ManyToMany(mappedBy = "following")
    List<AppUser> followerBy;

    String firstName;
    String lastName;
    String birthday;
    String bio;



    @Column(unique = true)
    String username;
    String password;


    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Friends",
            joinColumns = { @JoinColumn(name = "following") },
            inverseJoinColumns = { @JoinColumn(name = "followedBy") }
    )
    Set<AppUser> following = new HashSet<>();

    public AppUser(){}

    public AppUser(String username, String password, String firstName, String lastName, String birthday, String bio) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.bio = bio;
    }

    public AppUser(String username, String password){
        this.username = username;
        this.password = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public long getId() {
        return id;
    }

    public List<AppUser> getFollowerBy() {
        return followerBy;
    }

    public void setFollowerBy(AppUser followerBy) {
        this.followerBy.add(followerBy);
    }

    public Set<AppUser> getFollowing() {
        return following;
    }

    public void setFollowing(AppUser following) {
        this.following.add(following);
    }
}

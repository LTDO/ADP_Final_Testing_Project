package za.ac.cput;

/*

author marco mulonday

219049505

*/

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;



class StudentTest {

private Student student1;

private Student student2;

private Student student3;

@BeforeEach

void setUp() {

this.student1 = new Student();

this.student2 = new Student();

this.student3 = new Student();

this.student1 = this.student2;

}

// testing Identity

@Test

public void testIdentity() {

Assertions.assertSame(this.student1, this.student2);

}

// testing equality

@Test

public void testEquality() {

Assertions.assertEquals(this.student1, this.student2);

}

// test for faill test

@Test

public void testFail() {

Assertions.assertEquals(this.student1, this.student2);

Assertions.fail("this will faill");

}

// test for disable test



@Disabled("Disabled until CustomerService is up!")

@Test

void testCustomerServiceGet() {

Assertions.assertEquals(this.student1, this.student2);

}

}

package ca.etsmtl.log720.lab1;


/**
* ca/etsmtl/log720/lab1/InvalidIdException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Dossier.idl
* samedi 1 octobre 2016 17 h 19 EDT
*/

public final class InvalidIdException extends org.omg.CORBA.UserException
{

  public InvalidIdException ()
  {
    super(InvalidIdExceptionHelper.id());
  } // ctor


  public InvalidIdException (String $reason)
  {
    super(InvalidIdExceptionHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidIdException

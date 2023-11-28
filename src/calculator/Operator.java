package calculator;

abstract class Operator
{
  State state;

  abstract void execute();
}

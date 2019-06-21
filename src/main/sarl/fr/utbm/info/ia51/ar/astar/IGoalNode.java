package fr.utbm.info.ia51.ar.astar;

/**
 * GoalNodes don't need as much Information
 * as SearchNodes.
 * 
 * @author koffi Agbenya
 */
public interface IGoalNode{
    public boolean inGoal(ISearchNode other);
} 
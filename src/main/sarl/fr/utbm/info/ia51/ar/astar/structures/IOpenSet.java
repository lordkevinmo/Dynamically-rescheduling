package fr.utbm.info.ia51.ar.astar.structures;

import fr.utbm.info.ia51.ar.astar.ISearchNode;

/**
 * 
 * @author Koffi Agbenya
 *
 */
public interface IOpenSet {
	
	public void add(ISearchNode node);
	public void remove(ISearchNode node);
	public ISearchNode poll();
	//returns node if present otherwise null
	public ISearchNode getNode(ISearchNode node);
	public int size();

}

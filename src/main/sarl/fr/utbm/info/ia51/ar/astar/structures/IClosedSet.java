package fr.utbm.info.ia51.ar.astar.structures;

import fr.utbm.info.ia51.ar.astar.ISearchNode;

/**
 * 
 * 
 * @author Koffi Agbenya
 *
 */
public interface IClosedSet {

	public boolean contains(ISearchNode node);
	public void add(ISearchNode node);
	public ISearchNode min();

}
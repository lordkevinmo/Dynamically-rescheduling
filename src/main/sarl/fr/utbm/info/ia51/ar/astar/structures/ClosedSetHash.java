package fr.utbm.info.ia51.ar.astar.structures;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import fr.utbm.info.ia51.ar.astar.ISearchNode;

public class ClosedSetHash implements IClosedSet {
	private HashMap<Integer, ISearchNode> hashMap;
	private Comparator<ISearchNode> comp;
	
	public ClosedSetHash(Comparator<ISearchNode> comp) {
		this.hashMap = new HashMap<Integer, ISearchNode>();
		this.comp = comp;
		
	}

	@Override
	public boolean contains(ISearchNode node) {
		return this.hashMap.containsKey(node.keyCode());
	}

	@Override
	public void add(ISearchNode node) {
		this.hashMap.put(node.keyCode(), node);
	}

	@Override
	public ISearchNode min() {
		return Collections.min(hashMap.values(), comp);
	}

}
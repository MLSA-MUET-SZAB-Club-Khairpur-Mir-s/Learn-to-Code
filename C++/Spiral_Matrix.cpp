class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        
        int max = matrix[0].size() * matrix.size();
        
        vector<int> out;
        
        
        
        
        int x =0;
        int y =0;
        
        int h = matrix.size();
        int w = matrix[0].size();
        
        if(h==1)
        {
          for(int i=0;i<w;i++)
              out.push_back(matrix[0][i]);
            return out;
        }
        
        if(w==1)
        {
          for(int i=0;i<h;i++)
              out.push_back(matrix[i][0]);
            return out;
        }
        
        
        vector<vector<int>> maps(h,vector<int>(w,0));
        
      
        
        
    
        maps[0][0] = 1;
        out.push_back(matrix[0][0]);
        
        int instr = 1;
        
        while(true)
        {
            if(instr==1)
            {
                if((y+1)<w &&  maps[x][y+1]==0)
                {      
                    y++;
                    maps[x][y] =1;
                    out.push_back(matrix[x][y]);
                }
                else
                {
                    if((((y+1)>=w) && maps[x+1][y]==0) || 
                        ((y+1)<w && maps[x][y+1]==1 && maps[x+1][y]==0))
                    {
                        instr =2;
                        x++;
                        maps[x][y]=1;
                         out.push_back(matrix[x][y]);
                    }
                    else if(maps[x+1][y]==1)
                    {
                        break;
                    }                
                }      
            }
            else if(instr==2)
            {
                if((x+1)<h &&  maps[x+1][y]==0)
                {      
                    x++;
                    maps[x][y] =1;
                    out.push_back(matrix[x][y]);
                }
                else
                {
                    if((((x+1)>=h) && maps[x][y-1]==0) ||
                        ((x+1)<h && maps[x+1][y]==1 && maps[x][y-1]==0))
                    {
                        instr =3;
                        y--;
                        maps[x][y]=1;
                        out.push_back(matrix[x][y]);
                    }
                    else if(maps[x][y-1]==1)
                    {
                        break;
                    }                
                }      
            }
            else if(instr==3)
            {
                if((y-1)>=0 &&  maps[x][y-1]==0)
                {      
                    y--;
                    maps[x][y] =1;
                    out.push_back(matrix[x][y]);
                }
                else
                {
                    if((((y-1)<0) && maps[x-1][y]==0) ||
                        ((y-1)>=0 && maps[x][y-1]==1 && maps[x-1][y]==0))
                    {
                        instr =4;
                        x--;
                        maps[x][y]=1;
                         out.push_back(matrix[x][y]);
                    }
                      else if(maps[x-1][y]==1)
                    {
                        break;
                    }                
                }      
            }
            else if(instr==4)
            {
                if((x-1)>=0 &&  maps[x-1][y]==0)
                {      
                    x--;
                    maps[x][y] =1;
                    out.push_back(matrix[x][y]);
                }
                else
                {
                    if((((x-1)<0) && maps[x][y+1]==0) ||
                        ((x-1)>=0 && maps[x-1][y]==1 && maps[x][y+1]==0))
                    {
                        instr =1;
                        y++;
                        maps[x][y]=1;
                        out.push_back(matrix[x][y]);
                    }
                    else if(maps[x][y+1]==1)
                    {
                        break;
                    }                
                }      
            }
            
            
            
        }
        
        
        
        return out;
        
        
    }
};

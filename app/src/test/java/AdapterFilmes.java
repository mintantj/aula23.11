
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.junit.runner.manipulation.Ordering;

public class AdapterFilmes extends RecyclerView.Adapter<AdapterFilmes.ViewHolder> {

    public AdapterFilmes(Contexzt contexto, list<Filmes> lstFilmes) {
        this.contexto = contexto;
        this.lstFilmes = lstFilmes;
    }

    private Context contexto ;
    private list<Filmes> lstFilmes;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
 
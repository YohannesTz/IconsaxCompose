package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Ontology: ImageVector
    get() {
        val current = _ontology
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Ontology",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.9f, y = 19.7f)
                curveToRelative(dx1 = -1.7f, dy1 = 1.5f, dx2 = -4.0f, dy2 = 2.4f, dx3 = -6.5f, dy3 = 2.3f)
                curveToRelative(dx1 = -5.2f, dy1 = -0.1f, dx2 = -9.2f, dy2 = -4.6f, dx3 = -9.2f, dy3 = -9.8f)
                verticalLineToRelative(dy = -7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = 0.5f, dy2 = -0.7f, dx3 = 0.9f, dy3 = -0.4f)
                close()
                moveTo(x = 6.2f, y = 4.3f)
                curveToRelative(dx1 = 1.7f, dy1 = -1.5f, dx2 = 4.0f, dy2 = -2.4f, dx3 = 6.4f, dy3 = -2.3f)
                curveToRelative(dx1 = 5.1f, dy1 = 0.1f, dx2 = 9.1f, dy2 = 4.5f, dx3 = 9.1f, dy3 = 9.7f)
                verticalLineToRelative(dy = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.4f, dx2 = -0.5f, dy2 = 0.7f, dx3 = -0.9f, dy3 = 0.4f)
                close()
            }
        }.build().also { _ontology = it }
    }

@Suppress("ObjectPropertyName")
private var _ontology: ImageVector? = null

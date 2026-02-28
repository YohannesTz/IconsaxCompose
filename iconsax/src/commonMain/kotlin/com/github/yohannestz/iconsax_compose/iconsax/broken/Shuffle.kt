package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Shuffle: ImageVector
    get() {
        val current = _shuffle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Shuffle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.45f, y = 6.0f)
                lineTo(x = 21.0f, y = 6.02f)
                moveTo(x = 3.0f, y = 17.98f)
                lineToRelative(dx = 2.55f, dy = 0.01f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.26f, dy1 = -1.2f)
                lineToRelative(dx = 1.18f, dy = -1.77f)
                lineToRelative(dx = 0.76f, dy = -1.14f)
                lineTo(x = 13.67f, y = 8.0f)
                moveTo(x = 19.0f, y = 19.98f)
                lineToRelative(dx = 2.0f, dy = -2.0f)
                moveTo(x = 8.89f, y = 8.62f)
                lineToRelative(dx = -1.08f, dy = -1.5f)
                arcTo(horizontalEllipseRadius = 2.7f, verticalEllipseRadius = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.61f, y1 = 6.0f)
                lineTo(x = 3.0f, y = 6.01f)
                moveToRelative(dx = 9.97f, dy = 9.37f)
                lineToRelative(dx = 1.22f, dy = 1.57f)
                arcTo(horizontalEllipseRadius = 2.7f, verticalEllipseRadius = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.34f, y1 = 18.0f)
                lineTo(x = 21.0f, y = 17.98f)
                moveTo(x = 21.0f, y = 6.02f)
                lineToRelative(dx = -2.0f, dy = -2.0f)
            }
        }.build().also { _shuffle = it }
    }

@Suppress("ObjectPropertyName")
private var _shuffle: ImageVector? = null

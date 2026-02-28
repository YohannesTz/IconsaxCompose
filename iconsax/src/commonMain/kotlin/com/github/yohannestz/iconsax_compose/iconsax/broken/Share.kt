package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Share: ImageVector
    get() {
        val current = _share
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Share",
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
                moveTo(x = 16.96f, y = 6.17f)
                curveToRelative(dx1 = 2.0f, dy1 = 1.4f, dx2 = 3.38f, dy2 = 3.6f, dx3 = 3.66f, dy3 = 6.15f)
                moveTo(x = 3.49f, y = 12.37f)
                arcToRelative(a = 8.6f, b = 8.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.6f, dy1 = -6.15f)
                moveToRelative(dx = 1.1f, dy = 14.72f)
                arcToRelative(a = 8.5f, b = 8.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 7.6f, dy1 = 0.07f)
                moveTo(x = 9.28f, y = 4.92f)
                arcToRelative(a = 2.78f, b = 2.78f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 2.78f, dy1 = -2.78f)
                moveTo(x = 4.83f, y = 19.92f)
                arcToRelative(a = 2.78f, b = 2.78f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -5.56f)
                arcToRelative(a = 2.78f, b = 2.78f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 5.56f)
                moveToRelative(dx = 17.11f, dy = -2.78f)
                arcToRelative(a = 2.78f, b = 2.78f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -2.78f, dy1 = 2.78f)
            }
        }.build().also { _share = it }
    }

@Suppress("ObjectPropertyName")
private var _share: ImageVector? = null

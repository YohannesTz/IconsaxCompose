package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Component: ImageVector
    get() {
        val current = _component
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Component",
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
                moveTo(x = 6.74f, y = 18.24f)
                lineToRelative(dx = -3.68f, dy = -3.68f)
                arcToRelative(a = 3.63f, b = 3.63f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -5.1f)
                lineToRelative(dx = 6.39f, dy = -6.4f)
                curveToRelative(dx1 = 1.4f, dy1 = -1.4f, dx2 = 3.7f, dy2 = -1.4f, dx3 = 5.11f, dy3 = 0.0f)
                lineToRelative(dx = 6.39f, dy = 6.4f)
                curveToRelative(dx1 = 1.4f, dy1 = 1.4f, dx2 = 1.4f, dy2 = 3.7f, dx3 = 0.0f, dy3 = 5.1f)
                lineToRelative(dx = -6.39f, dy = 6.4f)
                arcToRelative(a = 3.63f, b = 3.63f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.11f, dy1 = 0.0f)
            }
        }.build().also { _component = it }
    }

@Suppress("ObjectPropertyName")
private var _component: ImageVector? = null

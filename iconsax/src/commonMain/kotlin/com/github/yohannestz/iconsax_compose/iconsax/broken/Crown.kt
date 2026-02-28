package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Crown: ImageVector
    get() {
        val current = _crown
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Crown",
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
                moveTo(x = 20.1f, y = 5.69f)
                curveToRelative(dx1 = 1.56f, dy1 = -1.12f, dx2 = 2.31f, dy2 = -0.55f, dx3 = 1.67f, dy3 = 1.26f)
                lineToRelative(dx = -4.04f, dy = 11.31f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.03f, dy1 = 0.73f)
                horizontalLineTo(x = 7.3f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.03f, dy1 = -0.73f)
                lineTo(x = 2.13f, y = 6.67f)
                curveTo(x1 = 1.54f, y1 = 5.01f, x2 = 2.23f, y2 = 4.5f, x3 = 3.65f, y3 = 5.52f)
                lineToRelative(dx = 3.9f, dy = 2.79f)
                curveTo(x1 = 8.2f, y1 = 8.76f, x2 = 8.94f, y2 = 8.53f, x3 = 9.22f, y3 = 7.8f)
                lineToRelative(dx = 1.76f, dy = -4.69f)
                curveToRelative(dx1 = 0.56f, dy1 = -1.5f, dx2 = 1.49f, dy2 = -1.5f, dx3 = 2.05f, dy3 = 0.0f)
                lineToRelative(dx = 1.76f, dy = 4.69f)
                curveToRelative(dx1 = 0.28f, dy1 = 0.73f, dx2 = 1.02f, dy2 = 0.96f, dx3 = 1.66f, dy3 = 0.51f)
                lineToRelative(dx = 0.63f, dy = -0.45f)
                moveTo(x = 6.5f, y = 22.0f)
                horizontalLineToRelative(dx = 11.0f)
                moveToRelative(dx = -8.0f, dy = -8.0f)
                horizontalLineToRelative(dx = 5.0f)
            }
        }.build().also { _crown = it }
    }

@Suppress("ObjectPropertyName")
private var _crown: ImageVector? = null

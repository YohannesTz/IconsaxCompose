package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Security: ImageVector
    get() {
        val current = _security
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Security",
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
                moveTo(x = 3.09f, y = 6.61f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.39f, dy1 = -2.06f)
                lineToRelative(dx = 5.57f, dy = -2.28f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.91f, dy1 = 0.0f)
                lineToRelative(dx = 5.57f, dy = 2.28f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.39f, dy1 = 2.06f)
                verticalLineTo(y = 11.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.89f, dx2 = -3.55f, dy2 = 9.47f, dx3 = -8.4f, dy3 = 10.81f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.02f, dy1 = 0.0f)
                curveTo(x1 = 6.65f, y1 = 20.47f, x2 = 3.1f, y2 = 15.89f, x3 = 3.1f, y3 = 11.0f)
            }
        }.build().also { _security = it }
    }

@Suppress("ObjectPropertyName")
private var _security: ImageVector? = null

package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Pause: ImageVector
    get() {
        val current = _pause
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Pause",
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
                moveTo(x = 5.01f, y = 3.0f)
                curveTo(x1 = 3.57f, y1 = 3.0f, x2 = 3.0f, y2 = 3.54f, x3 = 3.0f, y3 = 4.89f)
                verticalLineToRelative(dy = 14.22f)
                curveTo(x1 = 3.0f, y1 = 20.46f, x2 = 3.57f, y2 = 21.0f, x3 = 5.01f, y3 = 21.0f)
                horizontalLineToRelative(dx = 3.63f)
                curveToRelative(dx1 = 1.43f, dy1 = 0.0f, dx2 = 2.01f, dy2 = -0.54f, dx3 = 2.01f, dy3 = -1.89f)
                verticalLineTo(y = 4.89f)
                curveTo(x1 = 10.65f, y1 = 3.54f, x2 = 10.08f, y2 = 3.0f, x3 = 8.64f, y3 = 3.0f)
                moveToRelative(dx = 10.35f, dy = 18.0f)
                curveToRelative(dx1 = 1.43f, dy1 = 0.0f, dx2 = 2.01f, dy2 = -0.54f, dx3 = 2.01f, dy3 = -1.89f)
                verticalLineTo(y = 4.89f)
                curveTo(x1 = 21.0f, y1 = 3.54f, x2 = 20.43f, y2 = 3.0f, x3 = 19.0f, y3 = 3.0f)
                horizontalLineToRelative(dx = -3.64f)
                curveToRelative(dx1 = -1.43f, dy1 = 0.0f, dx2 = -2.0f, dy2 = 0.54f, dx3 = -2.0f, dy3 = 1.89f)
                verticalLineToRelative(dy = 14.22f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.35f, dx2 = 0.56f, dy2 = 1.89f, dx3 = 2.0f, dy3 = 1.89f)
            }
        }.build().also { _pause = it }
    }

@Suppress("ObjectPropertyName")
private var _pause: ImageVector? = null

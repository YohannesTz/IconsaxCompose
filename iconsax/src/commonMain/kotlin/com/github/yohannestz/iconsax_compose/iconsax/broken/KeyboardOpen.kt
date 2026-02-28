package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val KeyboardOpen: ImageVector
    get() {
        val current = _keyboardOpen
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.KeyboardOpen",
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
                moveTo(x = 2.0f, y = 7.26f)
                curveTo(x1 = 2.0f, y1 = 3.7f, x2 = 2.75f, y2 = 2.4f, x3 = 5.52f, y3 = 2.09f)
                arcTo(horizontalEllipseRadius = 13.0f, verticalEllipseRadius = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.27f, y1 = 2.0f)
                horizontalLineToRelative(dx = 9.47f)
                quadToRelative(dx1 = 0.97f, dy1 = 0.0f, dx2 = 1.75f, dy2 = 0.09f)
                curveToRelative(dx1 = 2.77f, dy1 = 0.31f, dx2 = 3.52f, dy2 = 1.61f, dx3 = 3.52f, dy3 = 5.17f)
                verticalLineToRelative(dy = 6.32f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.56f, dx2 = -0.75f, dy2 = 4.86f, dx3 = -3.52f, dy3 = 5.17f)
                arcToRelative(a = 13.0f, b = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.75f, dy1 = 0.09f)
                horizontalLineTo(x = 7.27f)
                quadToRelative(dx1 = -0.97f, dy1 = 0.0f, dx2 = -1.75f, dy2 = -0.09f)
                curveTo(x1 = 2.75f, y1 = 18.44f, x2 = 2.0f, y2 = 17.14f, x3 = 2.0f, y3 = 13.58f)
                verticalLineTo(y = 11.1f)
                moveToRelative(dx = 11.58f, dy = -2.78f)
                horizontalLineToRelative(dx = 3.68f)
                moveTo(x = 6.74f, y = 14.11f)
                horizontalLineToRelative(dx = 10.53f)
                moveTo(x = 7.0f, y = 22.0f)
                horizontalLineToRelative(dx = 10.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                moveTo(x = 7.2f, y = 8.3f)
                close()
                moveToRelative(dx = 3.3f, dy = 0.0f)
                close()
            }
        }.build().also { _keyboardOpen = it }
    }

@Suppress("ObjectPropertyName")
private var _keyboardOpen: ImageVector? = null

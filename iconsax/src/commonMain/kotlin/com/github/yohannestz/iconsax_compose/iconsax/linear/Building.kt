package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Building: ImageVector
    get() {
        val current = _building
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Building",
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
                moveTo(x = 12.5f, y = 22.0f)
                horizontalLineTo(x = 4.08f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.11f, dy1 = -2.07f)
                verticalLineTo(y = 5.09f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.62f, dx2 = 1.95f, dy2 = -3.81f, dx3 = 4.34f, dy3 = -2.64f)
                lineToRelative(dx = 4.44f, dy = 2.18f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.75f, dy1 = 2.78f)
                close()
                moveToRelative(dx = 9.47f, dy = -6.94f)
                verticalLineToRelative(dy = 3.78f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.16f, dx2 = -1.0f, dy2 = 3.16f, dx3 = -3.16f, dy3 = 3.16f)
                horizontalLineTo(x = 12.5f)
                verticalLineTo(y = 10.42f)
                lineToRelative(dx = 0.47f, dy = 0.1f)
                lineToRelative(dx = 4.5f, dy = 1.01f)
                lineToRelative(dx = 2.03f, dy = 0.45f)
                curveToRelative(dx1 = 1.32f, dy1 = 0.29f, dx2 = 2.4f, dy2 = 0.97f, dx3 = 2.46f, dy3 = 2.89f)
                close()
                moveTo(x = 5.5f, y = 9.0f)
                horizontalLineToRelative(dx = 3.47f)
                moveTo(x = 5.5f, y = 13.0f)
                horizontalLineToRelative(dx = 3.47f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.47f, y = 11.53f)
                verticalLineToRelative(dy = 3.22f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.5f, dy1 = 0.0f)
                verticalLineToRelative(dy = -4.23f)
                close()
                moveToRelative(dx = 4.49f, dy = 3.34f)
                arcTo(horizontalEllipseRadius = 2.25f, verticalEllipseRadius = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 19.72f, y1 = 17.0f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.25f, dy1 = -2.25f)
                verticalLineToRelative(dy = -3.22f)
                lineToRelative(dx = 2.03f, dy = 0.45f)
                curveToRelative(dx1 = 1.32f, dy1 = 0.29f, dx2 = 2.4f, dy2 = 0.97f, dx3 = 2.46f, dy3 = 2.89f)
            }
        }.build().also { _building = it }
    }

@Suppress("ObjectPropertyName")
private var _building: ImageVector? = null

package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gift: ImageVector
    get() {
        val current = _gift
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Gift",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.97f, y = 18.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = 1.0f, dy2 = 4.0f, dx3 = 4.0f, dy3 = 4.0f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 4.0f, dy2 = -1.0f, dx3 = 4.0f, dy3 = -4.0f)
                verticalLineToRelative(dy = -8.0f)
                horizontalLineToRelative(dx = -16.0f)
                verticalLineToRelative(dy = 3.84f)
                moveTo(x = 21.5f, y = 7.0f)
                verticalLineToRelative(dy = 1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.1f, dx2 = -0.53f, dy2 = 2.0f, dx3 = -2.0f, dy3 = 2.0f)
                horizontalLineToRelative(dx = -15.0f)
                curveToRelative(dx1 = -1.53f, dy1 = 0.0f, dx2 = -2.0f, dy2 = -0.9f, dx3 = -2.0f, dy3 = -2.0f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.1f, dx2 = 0.47f, dy2 = -2.0f, dx3 = 2.0f, dy3 = -2.0f)
                horizontalLineToRelative(dx = 15.0f)
                curveToRelative(dx1 = 1.47f, dy1 = 0.0f, dx2 = 2.0f, dy2 = 0.9f, dx3 = 2.0f, dy3 = 2.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.64f, y = 5.0f)
                horizontalLineTo(x = 6.12f)
                arcToRelative(a = 0.94f, b = 0.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.03f, dy1 = -1.3f)
                lineToRelative(dx = 1.42f, dy = -1.42f)
                arcToRelative(a = 0.96f, b = 0.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.35f, dy1 = 0.0f)
                close()
                moveToRelative(dx = 6.23f, dy = 0.0f)
                horizontalLineToRelative(dx = -5.52f)
                lineToRelative(dx = 2.72f, dy = -2.72f)
                arcToRelative(a = 0.96f, b = 0.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.35f, dy1 = 0.0f)
                lineToRelative(dx = 1.42f, dy = 1.42f)
                arcTo(horizontalEllipseRadius = 0.94f, verticalEllipseRadius = 0.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.87f, y1 = 5.0f)
                moveToRelative(dx = -8.93f, dy = 5.0f)
                verticalLineToRelative(dy = 5.14f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.55f, dy1 = 0.84f)
                lineToRelative(dx = 0.94f, dy = -0.62f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.1f, dy1 = 0.0f)
                lineToRelative(dx = 0.9f, dy = 0.6f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.54f, dy1 = -0.83f)
                verticalLineTo(y = 10.0f)
                close()
            }
        }.build().also { _gift = it }
    }

@Suppress("ObjectPropertyName")
private var _gift: ImageVector? = null

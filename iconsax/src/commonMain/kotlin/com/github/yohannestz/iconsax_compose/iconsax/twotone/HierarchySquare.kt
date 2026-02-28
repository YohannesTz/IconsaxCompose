package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HierarchySquare: ImageVector
    get() {
        val current = _hierarchySquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HierarchySquare",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.45f, y = 14.4f)
                verticalLineTo(y = 8.5f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = -1.0f)
                horizontalLineToRelative(dx = -2.9f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.05f, y = 6.0f)
                lineToRelative(dx = -1.8f, dy = 1.5f)
                lineToRelative(dx = 1.8f, dy = 1.5f)
                moveToRelative(dx = -6.5f, dy = 1.2f)
                verticalLineToRelative(dy = 4.2f)
                moveTo(x = 7.7f, y = 9.9f)
                arcToRelative(a = 1.95f, b = 1.95f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.9f)
                arcToRelative(a = 1.95f, b = 1.95f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.9f)
                moveTo(x = 7.55f, y = 18.0f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.6f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.6f)
                moveToRelative(dx = 8.9f, dy = 0.0f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.6f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.6f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.0f, y = 22.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = -2.0f, dx3 = 7.0f, dy3 = -7.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = -2.0f, dy2 = -7.0f, dx3 = -7.0f, dy3 = -7.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
            }
        }.build().also { _hierarchySquare = it }
    }

@Suppress("ObjectPropertyName")
private var _hierarchySquare: ImageVector? = null

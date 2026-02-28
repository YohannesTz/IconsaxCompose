package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FolderOpen: ImageVector
    get() {
        val current = _folderOpen
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FolderOpen",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.67f, y = 14.3f)
                lineToRelative(dx = -0.4f, dy = 5.0f)
                curveTo(x1 = 21.12f, y1 = 20.83f, x2 = 21.0f, y2 = 22.0f, x3 = 18.29f, y3 = 22.0f)
                horizontalLineTo(x = 5.71f)
                curveTo(x1 = 3.0f, y1 = 22.0f, x2 = 2.88f, y2 = 20.83f, x3 = 2.73f, y3 = 19.3f)
                lineToRelative(dx = -0.4f, dy = -5.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.65f, dy1 = -2.19f)
                lineTo(x = 3.0f, y = 12.09f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.31f, y1 = 11.0f)
                horizontalLineToRelative(dx = 13.38f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 21.0f, y1 = 12.1f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.67f, dy1 = 2.2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.5f, y = 11.43f)
                verticalLineTo(y = 6.28f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.4f, dx2 = 0.85f, dy2 = -4.25f, dx3 = 4.25f, dy3 = -4.25f)
                horizontalLineToRelative(dx = 1.27f)
                curveToRelative(dx1 = 1.27f, dy1 = 0.0f, dx2 = 1.56f, dy2 = 0.38f, dx3 = 2.04f, dy3 = 1.02f)
                lineToRelative(dx = 1.27f, dy = 1.7f)
                curveToRelative(dx1 = 0.32f, dy1 = 0.42f, dx2 = 0.51f, dy2 = 0.68f, dx3 = 1.36f, dy3 = 0.68f)
                horizontalLineToRelative(dx = 2.55f)
                curveToRelative(dx1 = 3.4f, dy1 = 0.0f, dx2 = 4.25f, dy2 = 0.85f, dx3 = 4.25f, dy3 = 4.25f)
                verticalLineToRelative(dy = 1.79f)
                moveTo(x = 9.43f, y = 17.0f)
                horizontalLineToRelative(dx = 5.14f)
            }
        }.build().also { _folderOpen = it }
    }

@Suppress("ObjectPropertyName")
private var _folderOpen: ImageVector? = null
